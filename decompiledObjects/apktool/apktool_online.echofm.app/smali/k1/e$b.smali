.class public Lk1/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:Ljava/util/Comparator;


# instance fields
.field public final a:Lk1/e$c;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk1/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lk1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk1/e$b;->c:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lk1/e$c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/e$b;->a:Lk1/e$c;

    iput p2, p0, Lk1/e$b;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Lk1/e$c;ILk1/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lk1/e$b;-><init>(Lk1/e$c;I)V

    return-void
.end method

.method public static synthetic a(Lk1/e$b;Lk1/e$b;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk1/e$b;->e(Lk1/e$b;Lk1/e$b;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lk1/e$b;->c:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic c(Lk1/e$b;)Lk1/e$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lk1/e$b;->a:Lk1/e$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lk1/e$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk1/e$b;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lk1/e$b;Lk1/e$b;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lk1/e$b;->a:Lk1/e$c;

    .line 2
    .line 3
    iget p0, p0, Lk1/e$c;->b:I

    .line 4
    .line 5
    iget-object p1, p1, Lk1/e$b;->a:Lk1/e$c;

    .line 6
    .line 7
    iget p1, p1, Lk1/e$c;->b:I

    .line 8
    .line 9
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
