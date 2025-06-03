.class public final Lgb/i2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/n3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/i2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/i2$b;->a:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final next()Ljava/io/InputStream;
    .locals 2

    iget-object v0, p0, Lgb/i2$b;->a:Ljava/io/InputStream;

    const/4 v1, 0x0

    iput-object v1, p0, Lgb/i2$b;->a:Ljava/io/InputStream;

    return-object v0
.end method
