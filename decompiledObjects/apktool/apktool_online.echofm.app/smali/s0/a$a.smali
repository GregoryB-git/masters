.class public Ls0/a$a;
.super Ls0/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/a;->z()Ls0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic t:Ls0/a;


# direct methods
.method public constructor <init>(Ls0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls0/a$a;->t:Ls0/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ls0/f;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls0/a$a;->t:Ls0/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ls0/a;->y(Ls0/a;Lj0/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
