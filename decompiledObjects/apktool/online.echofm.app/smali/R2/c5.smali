.class public final LR2/c5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Landroid/content/ComponentName;

.field public final synthetic p:LR2/a5;


# direct methods
.method public constructor <init>(LR2/a5;Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/c5;->p:LR2/a5;

    .line 2
    .line 3
    iput-object p2, p0, LR2/c5;->o:Landroid/content/ComponentName;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/c5;->p:LR2/a5;

    .line 2
    .line 3
    iget-object v0, v0, LR2/a5;->c:LR2/D4;

    .line 4
    .line 5
    iget-object v1, p0, LR2/c5;->o:Landroid/content/ComponentName;

    .line 6
    .line 7
    invoke-static {v0, v1}, LR2/D4;->I(LR2/D4;Landroid/content/ComponentName;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
