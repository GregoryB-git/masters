.class public final synthetic LR2/h5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/i5;

.field public synthetic p:LR2/Y1;

.field public synthetic q:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(LR2/i5;LR2/Y1;Landroid/app/job/JobParameters;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/h5;->o:LR2/i5;

    .line 5
    .line 6
    iput-object p2, p0, LR2/h5;->p:LR2/Y1;

    .line 7
    .line 8
    iput-object p3, p0, LR2/h5;->q:Landroid/app/job/JobParameters;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/h5;->o:LR2/i5;

    .line 2
    .line 3
    iget-object v1, p0, LR2/h5;->p:LR2/Y1;

    .line 4
    .line 5
    iget-object v2, p0, LR2/h5;->q:Landroid/app/job/JobParameters;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LR2/i5;->e(LR2/Y1;Landroid/app/job/JobParameters;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
