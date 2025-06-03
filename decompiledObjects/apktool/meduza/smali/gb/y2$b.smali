.class public final Lgb/y2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/y2$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2;->k(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/y2$a0;)V
    .locals 1

    iget-object p1, p1, Lgb/y2$a0;->a:Lgb/s;

    iget-object v0, p0, Lgb/y2$b;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Lgb/s;->k(Ljava/lang/String;)V

    return-void
.end method
