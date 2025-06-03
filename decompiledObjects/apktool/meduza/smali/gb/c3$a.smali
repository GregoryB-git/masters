.class public final Lgb/c3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lgb/c3;


# direct methods
.method public constructor <init>(Lgb/c3;)V
    .locals 0

    iput-object p1, p0, Lgb/c3$a;->a:Lgb/c3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lgb/c3$a;->a:Lgb/c3;

    invoke-virtual {v0}, Lgb/s0;->b()V

    return-void
.end method
