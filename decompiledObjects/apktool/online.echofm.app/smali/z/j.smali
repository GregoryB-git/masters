.class public final synthetic Lz/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lz/h$b;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lz/h$b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/j;->o:Lz/h$b;

    .line 5
    .line 6
    iput p2, p0, Lz/j;->p:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz/j;->o:Lz/h$b;

    .line 2
    .line 3
    iget v1, p0, Lz/j;->p:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz/h$b;->b(Lz/h$b;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
