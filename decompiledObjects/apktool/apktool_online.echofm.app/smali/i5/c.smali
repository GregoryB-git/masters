.class public final synthetic Li5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Li5/e$a;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li5/e$a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li5/c;->o:Li5/e$a;

    .line 5
    .line 6
    iput-object p2, p0, Li5/c;->p:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Li5/c;->o:Li5/e$a;

    .line 2
    .line 3
    iget-object v1, p0, Li5/c;->p:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, v1}, Li5/e$a;->d(Li5/e$a;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
