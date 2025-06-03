.class public final synthetic LL4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LL4/k;

.field public final synthetic p:LL4/c;


# direct methods
.method public synthetic constructor <init>(LL4/k;LL4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL4/j;->o:LL4/k;

    .line 5
    .line 6
    iput-object p2, p0, LL4/j;->p:LL4/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LL4/j;->o:LL4/k;

    .line 2
    .line 3
    iget-object v1, p0, LL4/j;->p:LL4/c;

    .line 4
    .line 5
    invoke-static {v0, v1}, LL4/k;->c(LL4/k;LL4/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
