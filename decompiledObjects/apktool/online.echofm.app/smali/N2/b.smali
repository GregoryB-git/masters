.class public final LN2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final o:LN2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LN2/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, LN2/b;-><init>(ZLN2/d;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LN2/b;->o:LN2/b;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ZLN2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ZLN2/c;)LN2/b;
    .locals 0

    .line 1
    sget-object p0, LN2/b;->o:LN2/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method
