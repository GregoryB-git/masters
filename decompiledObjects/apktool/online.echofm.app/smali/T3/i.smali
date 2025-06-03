.class public final synthetic LT3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LT3/n;

.field public final synthetic p:Z

.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(LT3/n;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT3/i;->o:LT3/n;

    .line 5
    .line 6
    iput-boolean p2, p0, LT3/i;->p:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LT3/i;->q:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LT3/i;->o:LT3/n;

    .line 2
    .line 3
    iget-boolean v1, p0, LT3/i;->p:Z

    .line 4
    .line 5
    iget-boolean v2, p0, LT3/i;->q:Z

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LT3/n;->v(LT3/n;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
