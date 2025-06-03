.class public final Lgb/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/f;->C(Lgb/u2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/u2;


# direct methods
.method public constructor <init>(Lhb/l;)V
    .locals 0

    iput-object p1, p0, Lgb/f$c;->a:Lgb/u2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lgb/f$c;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->close()V

    return-void
.end method
