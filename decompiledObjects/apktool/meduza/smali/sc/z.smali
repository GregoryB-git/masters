.class public final Lsc/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lub/h;

.field public final b:[Ljava/lang/Object;

.field public final c:[Lnc/b2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lnc/b2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public constructor <init>(Lub/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc/z;->a:Lub/h;

    new-array p1, p2, [Ljava/lang/Object;

    iput-object p1, p0, Lsc/z;->b:[Ljava/lang/Object;

    new-array p1, p2, [Lnc/b2;

    iput-object p1, p0, Lsc/z;->c:[Lnc/b2;

    return-void
.end method
