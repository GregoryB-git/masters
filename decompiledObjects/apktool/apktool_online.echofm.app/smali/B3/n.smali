.class public final synthetic LB3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LB3/y;

.field public final synthetic p:Lr4/b;


# direct methods
.method public synthetic constructor <init>(LB3/y;Lr4/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB3/n;->o:LB3/y;

    .line 5
    .line 6
    iput-object p2, p0, LB3/n;->p:Lr4/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LB3/n;->o:LB3/y;

    .line 2
    .line 3
    iget-object v1, p0, LB3/n;->p:Lr4/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, LB3/o;->l(LB3/y;Lr4/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
