.class public final Lk9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk9/g;

.field public final b:Lj9/q;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk9/i;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lma/h;

.field public final e:Lt8/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/c<",
            "Lj9/i;",
            "Lj9/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk9/g;Lj9/q;Ljava/util/ArrayList;Lma/h;Lt8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/h;->a:Lk9/g;

    iput-object p2, p0, Lk9/h;->b:Lj9/q;

    iput-object p3, p0, Lk9/h;->c:Ljava/util/List;

    iput-object p4, p0, Lk9/h;->d:Lma/h;

    iput-object p5, p0, Lk9/h;->e:Lt8/c;

    return-void
.end method
