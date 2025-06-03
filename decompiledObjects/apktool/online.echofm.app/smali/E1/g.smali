.class public final synthetic LE1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LE1/h;

.field public final synthetic p:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LE1/h;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE1/g;->o:LE1/h;

    .line 5
    .line 6
    iput-object p2, p0, LE1/g;->p:Ljava/lang/Runnable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LE1/g;->o:LE1/h;

    .line 2
    .line 3
    iget-object v1, p0, LE1/g;->p:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-static {v0, v1}, LE1/h;->a(LE1/h;Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
