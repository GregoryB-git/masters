.class public final synthetic LO5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final synthetic a:LO5/x;


# direct methods
.method public synthetic constructor <init>(LO5/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO5/o;->a:LO5/x;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LO5/o;->a:LO5/x;

    .line 2
    .line 3
    check-cast p1, Lcom/google/firebase/messaging/T;

    .line 4
    .line 5
    invoke-static {v0, p1}, LO5/x;->c(LO5/x;Lcom/google/firebase/messaging/T;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
